package ch3.union_find;

public class QuickUnion1 extends UF {
    int id[];
    int count;

    /**
     * N개 사이트의 식별자를 정수(0 ~ N-1)값으로 초기화
     *
     * @param N
     */
    public QuickUnion1(int N) {
        super(N);
        //컴포넌트 식별자 배열 초기화
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    /**
     * p와 q 간의 연결 추가
     *
     * @param p
     * @param q
     */
    @Override
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);

        if(pID == qID) return;

        for (int i = 0; i < id.length; i++) {
            if (id[i] ==pID) {
                id[i] = qID;
            }
        }
        count--;
    }

    /**
     * p(0~N-1)가 속한 컴포넌트 식별자
     *
     * @param p
     * @return
     */
    @Override
    public int find(int p) {
        return id[p];
    }

    /**
     * p와 q가 같은 컴포넌트에 속하면 true를 리턴
     *
     * @param p
     * @param q
     * @return
     */
    @Override
    boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * 전체 컴포넌트의 개수
     *
     * @return
     */
    @Override
    int count() {
        return count;
    }

    @Override
    double counter() {
        return 0;
    }
}
