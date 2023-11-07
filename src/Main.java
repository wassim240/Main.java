import java.util.ArrayList;
import java.util.List;

class Vertex {
    float x, y, z;

    public Vertex(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Face {
    int vertexIndex1, vertexIndex2, vertexIndex3;

    public Face(int v1, int v2, int v3) {
        vertexIndex1 = v1;
        vertexIndex2 = v2;
        vertexIndex3 = v3;
    }
}

