package ch3.union_find;

public class QuickUnion2 extends UF {
    int count;
    int uf[];

    /**
     * N개 사이트의 식별자를 정수(0 ~ N-1)값으로 초기화
     *
     * @param N
     */
    public QuickUnion2(int N) {
        super(N);
        uf = new int[N];
        count = N;
        for (int i = 0; i < N; i++) {
            uf[i] = i;
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
        int findP = find(p);
        int findQ = find(q);

        if (findP == findQ) return;

        for (int i = 0; i < uf.length; i++) {
            if (uf[i] == findQ)
                uf[i] = findP;
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
        return uf[p];
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
