# 876. Middle of The Linked List

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

## Notes

It's simple, first two pointers are created, one fast and one slow, and they iterate through the linked list, 2 steps at a time and 1 step at a time, respectively
Because of that, the fast pointer will reach the end of the list before the slow pointer
And because the slow pointer has half the speed of the fast one, it will reach just half of the way, thefore giving me just half of the list