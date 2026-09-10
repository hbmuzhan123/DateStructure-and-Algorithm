public class LinkListreverse {
    public static LinkList linkReverse(LinkList head)
    {
        LinkList temp=head;
        LinkList pre,Next;
        pre=null;
        Next=null;
        while(head!=null)
        {
            Next=head.next;
            head.next=pre;
            pre=head;
            head=Next;

        }
        pre.setSize(temp.linkListSize());//有于链表长度存储于头指针的size成员变量，所以新的头节点需要更新
        return pre;


    }
}
