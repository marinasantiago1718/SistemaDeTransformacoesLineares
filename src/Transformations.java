public class Transformations {

    float[] vector2d = new float[3];
    float[] vector3d = new float[4];





    public static Vector reflexao2Dx(Vector vetor) {
        float[] elementos = {
                1, 0, 0,
                0, -1, 0,
                0, 0, 1};
        Matrix matrizReflexao = new Matrix(3, 3, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3)};
        Matrix vetorMatriz = new Matrix(3, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizReflexao, vetorMatriz);
        return new Vector(2, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1)});
    }


    public static Vector reflexao2Dy(Vector vetor) {
        float[] elementos = {
                -1, 0, 0,
                0, 1, 0,
                0, 0, 1};
        Matrix matrizReflexao = new Matrix(3, 3, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3)};
        Matrix vetorMatriz = new Matrix(3, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizReflexao, vetorMatriz);
        return new Vector(2, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1)});
    }


    public static Vector reflexao3Dx(Vector vetor) {
        float[] elementos = {
                1, 0, 0, 0,
                0, -1, 0, 0,
                0, 0, -1, 0,
                0, 0, 0, 1};
        Matrix matrizReflexao = new Matrix(4, 4, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3),
                vetor.elementoVetor(4)};
        Matrix vetorMatriz = new Matrix(4, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizReflexao, vetorMatriz);
        return new Vector(3, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1),
                resultado.elementoMatriz(3, 1)});
    }

    public static Vector reflexao3Dy(Vector vetor) {
        float[] elementos = {
                -1, 0, 0, 0,
                0, 1, 0, 0,
                0, 0, -1, 0,
                0, 0, 0, 1};
        Matrix matrizReflexao = new Matrix(4, 4, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3),
                vetor.elementoVetor(4)};
        Matrix vetorMatriz = new Matrix(4, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizReflexao, vetorMatriz);
        return new Vector(3, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1),
                resultado.elementoMatriz(3, 1)});
    }

    public static Vector reflexao3Dz(Vector vetor) {
        float[] elementos = {
                -1, 0, 0, 0,
                0, -1, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1};
        Matrix matrizReflexao = new Matrix(4, 4, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3),
                vetor.elementoVetor(4)};
        Matrix vetorMatriz = new Matrix(4, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizReflexao, vetorMatriz);
        return new Vector(3, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1),
                resultado.elementoMatriz(3, 1)});
    }


    // TRANSLAÇÃO
    public static Vector translate2D(Vector vetor, float dx, float dy) {
        float[] elementos = {
                1, 0, dx,
                0, 1, dy,
                0, 0, 1};
        Matrix matrizTranslacao = new Matrix(3, 3, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3)};
        Matrix vetorMatriz = new Matrix(3,1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizTranslacao, vetorMatriz);
        return new Vector(2, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1)});
    }

    public static Vector translate3D(Vector vetor, float dx, float dy, float dz){
        float[] elementos = {
                1, 0, 0, dx,
                0, 1, 0, dy,
                0, 0, 1, dz,
                0, 0, 0, 1};
        Matrix matrizTranslacao = new Matrix(4, 4, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3),
                vetor.elementoVetor(4)};
        Matrix vetorMatriz = new Matrix(4,1,vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizTranslacao, vetorMatriz);
        return new Vector(3, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1),
                resultado.elementoMatriz(3, 1)});
    }

    // CISALHAMENTO
    public static Vector shearing(Vector vetor, float kx, float ky){
        float[] elementos = {
                1, kx, 0,
                ky, 1, 0,
                0, 0, 1};
        Matrix matrizCisalhamento = new Matrix(3, 3, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3)};
        Matrix vetorMatriz = new Matrix(3,1,vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizCisalhamento, vetorMatriz);
        return new Vector(2, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1)});
    }
    //PROJEÇÃO
    public static Vector projecao2DX(Vector vetor){
        float[] elementos = {
                1, 0, 0,
                0, 0, 0,
                0, 0, 1,
        };
        Matrix matrizProjecao2DX = new Matrix(3,3, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3)};
        Matrix vetorMatriz = new Matrix(3,1,vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizProjecao2DX, vetorMatriz);
        return new Vector(2, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1)});
    }

public static Vector projecao2DY(Vector vetor) {
    float[] elementos = {
            0, 0, 0,
            0, 1, 0,
            0, 0, 1,
    };
    Matrix matrizprojecao2DY = new Matrix(3,3, elementos);
    float[] vetorElementos = new float[] {
            vetor.elementoVetor(1),
            vetor.elementoVetor(2),
            vetor.elementoVetor(3)};
    Matrix vetorMatriz = new Matrix(3,1,vetorElementos);
    Matrix resultado = LinearAlgebra.dot(matrizprojecao2DY, vetorMatriz);
    return new Vector(2, new float[] {
            resultado.elementoMatriz(1, 1),
            resultado.elementoMatriz(2, 1)});
}
public static Vector projecao3DX(Vector vetor){
    float[] elementos = {
            1, 0, 0, 0,
            0, 0, 0, 0,
            0, 0, 0, 0,
            0, 0, 0, 1
    };
    Matrix matrizprojecao3DX = new Matrix(4,4, elementos);
    float[] vetorElementos = new float[] {
            vetor.elementoVetor(1),
            vetor.elementoVetor(2),
            vetor.elementoVetor(3),
            vetor.elementoVetor(4)};
    Matrix vetorMatriz = new Matrix(4,1,vetorElementos);
    Matrix resultado = LinearAlgebra.dot(matrizprojecao3DX, vetorMatriz);
    return new Vector(3, new float[] {
            resultado.elementoMatriz(1, 1),
            resultado.elementoMatriz(2, 1),
            resultado.elementoMatriz(3, 1)});
}
    public static Vector projecao3DY(Vector vetor) {
        float[] elementos = {
                0, 0, 0, 0,
                0, 1, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 1
        };
        Matrix matrizProjecao3DY = new Matrix(4, 4, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3),
                vetor.elementoVetor(4)};
        Matrix vetorMatriz = new Matrix(4,1,vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizProjecao3DY, vetorMatriz);
        return new Vector(3, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1),
                resultado.elementoMatriz(3, 1)});
    }
    public static Vector projecao3DZ(Vector vetor) {
      float[] elementos = {
            0, 0, 0, 0,
            0, 0, 0, 0,
            0, 0, 1, 0,
            0, 0, 0, 1
      };
    Matrix matrizprojecaoZ = new Matrix(4,4, elementos);
    float[] vetorElementos = new float[] {
            vetor.elementoVetor(1),
            vetor.elementoVetor(2),
            vetor.elementoVetor(3),
            vetor.elementoVetor(4)};
    Matrix vetorMatriz = new Matrix(4,1,vetorElementos);
    Matrix resultado = LinearAlgebra.dot(matrizprojecaoZ, vetorMatriz);
    return new Vector(3, new float[] {
            resultado.elementoMatriz(1, 1),
            resultado.elementoMatriz(2, 1),
            resultado.elementoMatriz(3, 1)});
}

    public static Vector rotacao2D(Vector vetor, float angulo) {
        float cos = (float) Math.cos(angulo);
        float sin = (float) Math.sin(angulo);

        float[] elementos = {
                cos, -sin, 0,
                sin, cos, 0,
                0, 0, 1
        };

        Matrix matrizRotacao = new Matrix(3, 3, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3)
        };

        Matrix vetorMatriz = new Matrix(3, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizRotacao, vetorMatriz);

        return new Vector(2, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1)
        });
    }

    public static Vector rotacao3DX(Vector vetor, float angulo) {
        float cos = (float) Math.cos(angulo);
        float sin = (float) Math.sin(angulo);

        float[] elementos = {
                1, 0, 0, 0,
                0, cos, -sin, 0,
                0, sin, cos, 0,
                0, 0, 0, 1
        };

        Matrix matrizRotacao = new Matrix(4, 4, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3),
                vetor.elementoVetor(4)
        };

        Matrix vetorMatriz = new Matrix(4, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizRotacao, vetorMatriz);

        return new Vector(3, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1),
                resultado.elementoMatriz(3, 1)
        });
    }

    public static Vector rotacao3DY(Vector vetor, float angulo) {
        float cos = (float) Math.cos(angulo);
        float sin = (float) Math.sin(angulo);

        float[] elementos = {
                cos, 0, sin, 0,
                0, 1, 0, 0,
                -sin, 0, cos, 0,
                0, 0, 0, 1
        };

        Matrix matrizRotacao = new Matrix(4, 4, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3),
                vetor.elementoVetor(4)
        };

        Matrix vetorMatriz = new Matrix(4, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizRotacao, vetorMatriz);

        return new Vector(3, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1),
                resultado.elementoMatriz(3, 1)
        });
    }

    public static Vector rotacao3DZ(Vector vetor, float angulo) {
        float cos = (float) Math.cos(angulo);
        float sin = (float) Math.sin(angulo);

        float[] elementos = {
                cos, -sin, 0, 0,
                sin, cos, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1
        };

        Matrix matrizRotacao = new Matrix(4, 4, elementos);
        float[] vetorElementos = new float[] {
                vetor.elementoVetor(1),
                vetor.elementoVetor(2),
                vetor.elementoVetor(3),
                vetor.elementoVetor(4)
        };

        Matrix vetorMatriz = new Matrix(4, 1, vetorElementos);
        Matrix resultado = LinearAlgebra.dot(matrizRotacao, vetorMatriz);

        return new Vector(3, new float[] {
                resultado.elementoMatriz(1, 1),
                resultado.elementoMatriz(2, 1),
                resultado.elementoMatriz(3, 1)
        });
    }

}

