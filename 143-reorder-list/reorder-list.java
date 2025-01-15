class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Populate the first ArrayList with all nodes
        ArrayList<ListNode> list1 = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list1.add(curr);
            curr = curr.next;
        }

        // Step 2: Separate into two lists (list1 and list2)
        ArrayList<ListNode> list2 = new ArrayList<>();
        int mid = (list1.size() + 1) / 2;
        for (int i = list1.size() - 1; i >= mid; i--) {
            list2.add(list1.remove(i));
        }

        // Step 3: Merge list1 and list2
        ListNode dummy = new ListNode(0);
        curr = dummy;

        for (int i = 0; i < list1.size(); i++) {
            curr.next = list1.get(i);
            curr = curr.next;

            if (i < list2.size()) {
                curr.next = list2.get(i);
                curr = curr.next;
            }
        }

        // Step 4: Terminate the list
        curr.next = null;
    }
}
