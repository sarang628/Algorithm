package ch3.union_find;

abstract public class UF {
    /**
     * N개 사이트의 식별자를 정수(0 ~ N-1)값으로 초기화
     *
     * @param N
     */
    public UF(int N) {
    }

    /**
     * p와 q 간의 연결 추가
     *
     * @param p
     * @param q
     */
    public abstract void union(int p, int q);

    /**
     * p(0~N-1)가 속한 컴포넌트 식별자
     *
     * @param p
     * @return
     */
    public abstract int find(int p);

    /**
     * p와 q가 같은 컴포넌트에 속하면 true를 리턴
     *
     * @param p
     * @param q
     * @return
     */
    abstract boolean connected(int p, int q);

    /**
     * 전체 컴포넌트의 개수
     *
     * @return
     */
    abstract int count();

    abstract double counter();
}
