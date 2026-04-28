import cv2

# Initialize webcam
cap = cv2.VideoCapture(0)

# Read first frame
ret, frame1 = cap.read()
gray1 = cv2.cvtColor(frame1, cv2.COLOR_BGR2GRAY)
gray1 = cv2.GaussianBlur(gray1, (21, 21), 0)

while True:
    ret, frame2 = cap.read()
    gray2 = cv2.cvtColor(frame2, cv2.COLOR_BGR2GRAY)
    gray2 = cv2.GaussianBlur(gray2, (21, 21), 0)

    # Frame differencing
    diff = cv2.absdiff(gray1, gray2)

    cv2.imshow("Frame Difference", diff)

    gray1 = gray2  # update reference frame

    if cv2.waitKey(30) & 0xFF == 27:  # ESC to exit
        break

cap.release()
cv2.destroyAllWindows()
