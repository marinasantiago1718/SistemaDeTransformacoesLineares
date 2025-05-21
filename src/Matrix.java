public class Matrix {
    private int rows;
    private int cols;
    private float[][] matriz;

    public Matrix(int k, int l, float[] elementos) {
        if (k <= 0 || l <= 0) {
            System.out.println("Dimensões inválidas para construção de matriz");
        } else {
            this.rows = k;
            this.cols = l;
            this.matriz = new float[k][l];

            int elementIndex = 0;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < l; j++) {
                    this.matriz[i][j] = elementos[elementIndex];
                    elementIndex++;
                }
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(byte rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(byte cols) {
        this.cols = cols;
    }

    public float elementoMatriz(int i, int j) {

        return matriz[i-1][j-1];
    }

    public void alterarElementoMatriz(int x, int y,int valor) {

        this.matriz[x-1][y-1] = valor;
    }
    public float[][] getMatriz() {
        return matriz;
    }
    public void setMatriz(float[][] matriz) {
        this.matriz = matriz;
    }

    public float[][] MatrizAmpliada(float[] colunaAdicional) {
        if (colunaAdicional.length != rows) {
            System.out.println("O comprimento do vetor de coluna deve ser igual ao número de linhas.");
        }
        float[][] matrizAmpliada = new float[rows][cols + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrizAmpliada[i][j] = matriz[i][j];
            }
            matrizAmpliada[i][cols] = colunaAdicional[i];
        }
        return matrizAmpliada;
    }
}

