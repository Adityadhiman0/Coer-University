#include<iostream>
using namespace std;

/* SINGLY LINKED LIST*/

struct snode
{
    int data;
    snode* next;
};

snode* shead=NULL;

void sInsertStart()
{
    snode* n=new snode();
    cout<<"Enter data: ";
    cin>>n->data;

    n->next=shead;
    shead=n;
}

void sInsertEnd()
{
    snode* n=new snode();
    cout<<"Enter data: ";
    cin>>n->data;
    n->next=NULL;

    if(shead==NULL)
        shead=n;
    else
    {
        snode* temp=shead;
        while(temp->next!=NULL)
            temp=temp->next;
        temp->next=n;
    }
}

void sDeleteStart()
{
    if(shead==NULL)
    {
        cout<<"List Empty\n";
        return;
    }

    snode* temp=shead;
    shead=shead->next;
    delete temp;
}

void sDisplay()
{
    snode* temp=shead;

    while(temp!=NULL)
    {
        cout<<temp->data<<" -> ";
        temp=temp->next;
    }
    cout<<"NULL\n";
}

/*  DOUBLY LINKED LIST */

struct dnode
{
    int data;
    dnode* prev;
    dnode* next;
};

dnode* dhead=NULL;

void dInsertStart()
{
    dnode* n=new dnode();
    cout<<"Enter data: ";
    cin>>n->data;

    n->prev=NULL;
    n->next=dhead;

    if(dhead!=NULL)
        dhead->prev=n;

    dhead=n;
}

void dInsertEnd()
{
    dnode* n=new dnode();
    cout<<"Enter data: ";
    cin>>n->data;

    if(dhead==NULL)
    {
        n->prev=NULL;
        n->next=NULL;
        dhead=n;
    }
    else
    {
        dnode* temp=dhead;
        while(temp->next!=NULL)
            temp=temp->next;

        temp->next=n;
        n->prev=temp;
        n->next=NULL;
    }
}

void dDeleteStart()
{
    if(dhead==NULL)
    {
        cout<<"List Empty\n";
        return;
    }

    dnode* temp=dhead;
    dhead=dhead->next;

    if(dhead!=NULL)
        dhead->prev=NULL;

    delete temp;
}

void dDeleteEnd()
{
    if(dhead==NULL)
    {
        cout<<"List Empty\n";
        return;
    }

    dnode* temp=dhead;

    if(temp->next==NULL)
    {
        delete temp;
        dhead=NULL;
        return;
    }

    while(temp->next!=NULL)
        temp=temp->next;

    temp->prev->next=NULL;
    delete temp;
}

void dDisplay()
{
    dnode* temp=dhead;

    while(temp!=NULL)
    {
        cout<<temp->data<<" <-> ";
        temp=temp->next;
    }
    cout<<"NULL\n";
}

/* CIRCULAR LINKED LIST */

struct cnode
{
    int data;
    cnode* next;
};

cnode* chead=NULL;

void cInsert()
{
    cnode* n=new cnode();
    cout<<"Enter data: ";
    cin>>n->data;

    if(chead==NULL)
    {
        chead=n;
        n->next=chead;
    }
    else
    {
        cnode* temp=chead;
        while(temp->next!=chead)
            temp=temp->next;

        temp->next=n;
        n->next=chead;
    }
}

void cDeleteStart()
{
    if(chead==NULL)
    {
        cout<<"List Empty\n";
        return;
    }

    cnode* temp=chead;

    if(chead->next==chead)
    {
        delete chead;
        chead=NULL;
        return;
    }

    cnode* last=chead;
    while(last->next!=chead)
        last=last->next;

    chead=chead->next;
    last->next=chead;

    delete temp;
}

void cDeleteEnd()
{
    if(chead==NULL)
    {
        cout<<"List Empty\n";
        return;
    }

    cnode* temp=chead;
    cnode* prev;

    if(chead->next==chead)
    {
        delete chead;
        chead=NULL;
        return;
    }

    while(temp->next!=chead)
    {
        prev=temp;
        temp=temp->next;
    }

    prev->next=chead;
    delete temp;
}

void cDisplay()
{
    if(chead==NULL)
    {
        cout<<"List Empty\n";
        return;
    }

    cnode* temp=chead;

    do
    {
        cout<<temp->data<<" -> ";
        temp=temp->next;
    }
    while(temp!=chead);

    cout<<"HEAD\n";
}

/*  MAIN MENU*/

int main()
{
    int choice,op;

    while(true)
    {
        cout<<"\nChoose your operation\n";
        cout<<"1. Singly Linked List\n";
        cout<<"2. Doubly Linked List\n";
        cout<<"3. Circular Linked List\n";
        cout<<"4. Exit\n";

        cin>>choice;

        switch(choice)
        {

        case 1:
            while(true)
            {
                cout<<"\n Singly Linked List\n";
                cout<<"1.Insert Start\n";
                cout<<"2.Insert End\n";
                cout<<"3.Delete Start\n";
                cout<<"4.Display\n";
                cout<<"5.Back\n";

                cin>>op;

                if(op==1) sInsertStart();
                else if(op==2) sInsertEnd();
                else if(op==3) sDeleteStart();
                else if(op==4) sDisplay();
                else break;
            }
            break;

        case 2:
            while(true)
            {
                cout<<"\n Doubly Linked List \n";
                cout<<"1.Insert Start\n";
                cout<<"2.Insert End\n";
                cout<<"3.Delete Start\n";
                cout<<"4.Delete End\n";
                cout<<"5.Display\n";
                cout<<"6.Back\n";

                cin>>op;

                if(op==1) dInsertStart();
                else if(op==2) dInsertEnd();
                else if(op==3) dDeleteStart();
                else if(op==4) dDeleteEnd();
                else if(op==5) dDisplay();
                else break;
            }
            break;

        case 3:
            while(true)
            {
                cout<<"\n Circular Linked List \n";
                cout<<"1.Insert\n";
                cout<<"2.Delete Start\n";
                cout<<"3.Delete End\n";
                cout<<"4.Display\n";
                cout<<"5.Back\n";

                cin>>op;

                if(op==1) cInsert();
                else if(op==2) cDeleteStart();
                else if(op==3) cDeleteEnd();
                else if(op==4) cDisplay();
                else break;
            }
            break;

        case 4:
            return 0;
        }
    }
}