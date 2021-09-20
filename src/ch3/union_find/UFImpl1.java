package ch3.union_find;

public class UFImpl1 extends UF {
    private int[] id; // 컴포넌트 식별자를 저장(배열 인덱스는 사이트를 의미)
    private int count; // 컴포넌트 개수
    private double counter = 0;

    public UFImpl1(int N) {
        super(N);
        //컴포넌트 식별자 배열 초기화
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    @Override
    public void union(int p, int q) {
        // p와 q를 같은 컴포넌트에 속하게 한다.
        int pID = find(p);
        int qID = find(q);

        // 이미 p, q와 같은 컴포넌트에 속해 있으면
        // 아무것도 하지 않는다.
        if (pID == qID) return;

        // id[p]의 값을 id[q]으로 바꾼다.
        id[pID] = qID;
        count--;
    }

    @Override
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
            counter++;
        }
        return p;
    }

    @Override
    boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    @Override
    int count() {
        return count;
    }

    @Override
    double counter() {
        return counter;
    }
}
