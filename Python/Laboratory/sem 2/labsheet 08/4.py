import cv2

cap = cv2.VideoCapture(0)
ret, frame1 = cap.read()
gray1 = cv2.cvtColor(frame1, cv2.COLOR_BGR2GRAY)
gray1 = cv2.GaussianBlur(gray1, (21, 21), 0)

# Define video writer (will be used only when motion occurs)
fourcc = cv2.VideoWriter_fourcc(*'XVID')
out = None

while True:
    ret, frame2 = cap.read()
    gray2 = cv2.cvtColor(frame2, cv2.COLOR_BGR2GRAY)
    gray2 = cv2.GaussianBlur(gray2, (21, 21), 0)

    diff = cv2.absdiff(gray1, gray2)
    _, thresh = cv2.threshold(diff, 25, 255, cv2.THRESH_BINARY)
    contours, _ = cv2.findContours(thresh, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

    motion_detected = False
    for contour in contours:
        if cv2.contourArea(contour) < 500:
            continue
        motion_detected = True
        (x, y, w, h) = cv2.boundingRect(contour)
        cv2.rectangle(frame2, (x, y), (x+w, y+h), (0, 255, 0), 2)

    if motion_detected:
        cv2.putText(frame2, "Motion Detected", (10, 30),
                    cv2.FONT_HERSHEY_SIMPLEX, 1, (0, 0, 255), 2)
        if out is None:  # initialize writer when motion starts
            out = cv2.VideoWriter('motion_output.avi', fourcc, 20.0,
                                  (frame2.shape[1], frame2.shape[0]))
        out.write(frame2)

    cv2.imshow("Motion Detection", frame2)
    gray1 = gray2

    if cv2.waitKey(30) & 0xFF == 27:
        break

cap.release()
if out is not None:
    out.release()
cv2.destroyAllWindows()
