import java.util.ArrayList;
import java.util.List;

class CalculateNormals {
    public static void main(String[] args) {
        // Пример данных вершин и граней модели (замените этим своими данными)
        List<Vertex> vertices = new ArrayList<>();
        List<Face> faces = new ArrayList<>();

        // Создайте список для нормалей
        List<float[]> normals = new ArrayList<>();

        // Вычисление нормалей для каждой грани
        for (Face face : faces) {
            Vertex v1 = vertices.get(face.vertexIndex1);
            Vertex v2 = vertices.get(face.vertexIndex2);
            Vertex v3 = vertices.get(face.vertexIndex3);

            float edge1X = v2.x - v1.x;
            float edge1Y = v2.y - v1.y;
            float edge1Z = v2.z - v1.z;

            float edge2X = v3.x - v1.x;
            float edge2Y = v3.y - v1.y;
            float edge2Z = v3.z - v1.z;

            float normalX = edge1Y * edge2Z - edge1Z * edge2Y;
            float normalY = edge1Z * edge2X - edge1X * edge2Z;
            float normalZ = edge1X * edge2Y - edge1Y * edge2X;

            // Нормализация нормали
            float length = (float) Math.sqrt(normalX * normalX + normalY * normalY + normalZ * normalZ);
            normalX /= length;
            normalY /= length;
            normalZ /= length;

            normals.add(new float[]{normalX, normalY, normalZ});
        }

        // Теперь у вас есть список нормалей для каждой грани модели.
    }
}
