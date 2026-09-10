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
        pre.setSize(temp.linkListSize());
        return pre;
    }
}
