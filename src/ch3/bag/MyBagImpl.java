package ch3.bag;

import java.util.Iterator;

public class MyBagImpl<Item> implements MyBag<Item> {

    //링크드 리스트를 활용하여 구현. 노드 클래스 생성
    private class Node<Item> {
        Item item;              //현재 노드의 값
        Node<Item> next = null; //다음 노드
    }

    Node<Item> first = null; //Bag의 첫번째 노드
    int size = 0; //크기

    public MyBagImpl() {
        //초기화
        first = null;
        size = 0;
    }

    /**
     * 백에 값 추가
     *
     * @param item 추가할 값
     */
    @Override
    public void add(Item item) {
        Node<Item> oldFirst = first; //첫번쨰 노드의 임시 저장노드 생성
        first = new Node<Item>();    //첫번쨰 노드 초기화
        first.item = item;           // 첫번째 노드에 새로받은 값 설정
        first.next = oldFirst;       // 첫번쨰 노드의 링크를 임시 노드에 연결
        size++;                      // 크기 추가
    }

    /**
     * 백의 크기 반환
     *
     * @return 백의 크기
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Interator 구현을 위한 필수 함수
     *
     * @return
     */
    @Override
    public Iterator<Item> iterator() {
        return new LinkedListIterator(first);
    }

    //Iterator 구현
    private class LinkedListIterator implements Iterator<Item> {
        Node<Item> first;

        public LinkedListIterator(Node<Item> first) {
            this.first = first;
        }

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return first != null;
        }

        /**
         * Returns the next element in the iteration.
         *
         * @return the next element in the iteration
         * @throws NoSuchElementException if the iteration has no more elements
         */
        @Override
        public Item next() {
            Item item = first.item; //현재 노트의 아이템 저장
            first = first.next;     //현재노드를 다음노드로 변경
            return item;            // 아이템 반환
        }
    }
}
