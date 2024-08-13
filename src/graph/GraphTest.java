package graph;

public class GraphTest {
    public static void main(String[] args) {
        // Test Case 1
        IGraph g1 = new GraphImpl(3);
        g1.addEdge(0, 1);
        g1.addEdge(0, 2);
        if (g1.edgeCount() != 2 || g1.vertexCount() != 3) {
            System.out.println("Test Case 1 failed");
        } else {
            System.out.println("Test Case 1 success");
        }

        // Test Case 2
        IGraph g2 = new GraphImpl(4);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.addEdge(2, 3);
        g2.addEdge(3, 0);
        if (g2.edgeCount() != 4 || g2.vertexCount() != 4) {
            System.out.println("Test Case 2 failed");
        } else {
            System.out.println("Test Case 2 success");
        }

        // Test Case 3
        IGraph g3 = new GraphImpl(5);
        g3.addEdge(0, 1);
        g3.addEdge(0, 4);
        g3.addEdge(1, 2);
        g3.addEdge(1, 3);
        g3.addEdge(1, 4);
        g3.addEdge(2, 3);
        g3.addEdge(3, 4);
        if (g3.edgeCount() != 7 || g3.vertexCount() != 5) {
            System.out.println("Test Case 3 failed");
        } else {
            System.out.println("Test Case 3 success");
        }

        // Test Case 4
        IGraph g4 = new GraphImpl(2);
        g4.addEdge(0, 1);
        if (g4.edgeCount() != 1 || g4.vertexCount() != 2) {
            System.out.println("Test Case 4 failed");
        } else {
            System.out.println("Test Case 4 success");
        }

        // Test Case 5
        IGraph g5 = new GraphImpl(3);
        g5.addEdge(0, 1);
        g5.addEdge(1, 2);
        if (g5.edgeCount() != 2 || g5.vertexCount() != 3) {
            System.out.println("Test Case 5 failed");
        } else {
            System.out.println("Test Case 5 success");
        }

        // Test Case 6
        IGraph g6 = new GraphImpl(6);
        g6.addEdge(0, 1);
        g6.addEdge(0, 2);
        g6.addEdge(1, 3);
        g6.addEdge(2, 4);
        g6.addEdge(3, 5);
        if (g6.edgeCount() != 5 || g6.vertexCount() != 6) {
            System.out.println("Test Case 6 failed");
        } else {
            System.out.println("Test Case 6 success");
        }

        // Test Case 7
        IGraph g7 = new GraphImpl(4);
        g7.addEdge(0, 1);
        g7.addEdge(0, 2);
        g7.addEdge(0, 3);
        if (g7.edgeCount() != 3 || g7.vertexCount() != 4) {
            System.out.println("Test Case 7 failed");
        } else {
            System.out.println("Test Case 7 success");
        }

        // Test Case 8
        IGraph g8 = new GraphImpl(3);
        g8.addEdge(0, 1);
        g8.addEdge(1, 2);
        g8.addEdge(2, 0);
        if (g8.edgeCount() != 3 || g8.vertexCount() != 3) {
            System.out.println("Test Case 8 failed");
        } else {
            System.out.println("Test Case 8 success");
        }

        // Test Case 9
        IGraph g9 = new GraphImpl(5);
        g9.addEdge(0, 1);
        g9.addEdge(0, 2);
        g9.addEdge(2, 3);
        g9.addEdge(2, 4);
        if (g9.edgeCount() != 4 || g9.vertexCount() != 5) {
            System.out.println("Test Case 9 failed");
        } else {
            System.out.println("Test Case 9 success");
        }

        // Test Case 10
        IGraph g10 = new GraphImpl(4);
        g10.addEdge(0, 1);
        g10.addEdge(0, 2);
        g10.addEdge(1, 2);
        g10.addEdge(2, 3);
        if (g10.edgeCount() != 4 || g10.vertexCount() != 4) {
            System.out.println("Test Case 10 failed");
        } else {
            System.out.println("Test Case 10 success");
        }

        // Test Case 11
        IGraph g11 = new GraphImpl(3);
        g11.addEdge(0, 1);
        g11.addEdge(1, 2);
        if (g11.edgeCount() != 2 || g11.vertexCount() != 3) {
            System.out.println("Test Case 11 failed");
        } else {
            System.out.println("Test Case 11 success");
        }

        // Test Case 12
        IGraph g12 = new GraphImpl(6);
        g12.addEdge(0, 1);
        g12.addEdge(0, 2);
        g12.addEdge(1, 3);
        g12.addEdge(2, 4);
        g12.addEdge(3, 5);
        g12.addEdge(4, 5);
        if (g12.edgeCount() != 6 || g12.vertexCount() != 6) {
            System.out.println("Test Case 12 failed");
        } else {
            System.out.println("Test Case 12 success");
        }

        // Test Case 13
        IGraph g13 = new GraphImpl(5);
        g13.addEdge(0, 1);
        g13.addEdge(1, 2);
        g13.addEdge(2, 3);
        g13.addEdge(3, 4);
        if (g13.edgeCount() != 4 || g13.vertexCount() != 5) {
            System.out.println("Test Case 13 failed");
        } else {
            System.out.println("Test Case 13 success");
        }

        // Test Case 14
        IGraph g14 = new GraphImpl(4);
        g14.addEdge(0, 1);
        g14.addEdge(1, 2);
        g14.addEdge(2, 3);
        g14.addEdge(3, 0);
        if (g14.edgeCount() != 4 || g14.vertexCount() != 4) {
            System.out.println("Test Case 14 failed");
        } else {
            System.out.println("Test Case 14 success");
        }

        // Test Case 15
        IGraph g15 = new GraphImpl(3);
        g15.addEdge(0, 1);
        g15.addEdge(1, 0);
        if (g15.edgeCount() != 1 || g15.vertexCount() != 3) {
            System.out.println("Test Case 15 failed");
        } else {
            System.out.println("Test Case 15 success");
        }

        // Test Case 16
        IGraph g16 = new GraphImpl(6);
        g16.addEdge(0, 1);
        g16.addEdge(0, 2);
        g16.addEdge(1, 3);
        g16.addEdge(2, 3);
        g16.addEdge(3, 4);
        g16.addEdge(4, 5);
        if (g16.edgeCount() != 6 || g16.vertexCount() != 6) {
            System.out.println("Test Case 16 failed");
        } else {
            System.out.println("Test Case 16 success");
        }
    }
}
