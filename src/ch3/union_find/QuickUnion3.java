package ch3.union_find;

public class QuickUnion3 extends UF {

    int uf[];
    int count;

    int findCount = 0;
    int unionCount = 0;

    /**
     * N개 사이트의 식별자를 정수(0 ~ N-1)값으로 초기화
     *
     * @param N
     */
    public QuickUnion3(int N) {
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
        int pId = uf[p]; // 1회
        int qId = uf[q]; // 1회

        if (pId == qId)
            return;

        for (int i = 0; i < uf.length; i++) {
            if (qId == uf[i]) // N회
            {
                uf[i] = pId; // 1회 ~ N-1회
            }
        }
        count--;

        //2회 + N회 + (1회 ~ N-1회)
        //최소 : N회 + 2회 + 1회 = N+3
        //최대 : N회 + 2회 + N-1회 = 2N+1
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
