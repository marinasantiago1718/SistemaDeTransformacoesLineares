public class Vector {
    private int dim;
    private float[] elementos;

    public Vector(int dim, float[] elementos){
        if(dim <=0){
            System.out.println("Dimensão inválida para vetor.");
        } else{
            this.dim = dim;
            this.elementos = new float[dim];
            for (int i = 0; i < dim; i++) {
                this.elementos[i] = elementos[i];
            }
        }

    }
    public void imprimirVetor(){
        for (int i = 0; i < dim; i++) {

                System.out.println(elementos[i] );

        }
    }
    public void imprimirVetorTranposto(){
        for (int i = 0; i < dim; i++) {

                System.out.print(elementos[i] + " ");

        }
    }

    public void imprimirVetorEmLinhas() {
        for (float elemento : this.elementos) {
            System.out.printf("%.2f%n", elemento);  // Formatação para duas casas decimais em linhas separadas
        }
    }


    public float elementoVetor(int pos){
        return elementos[pos - 1];
    }
    public void mudarElemento(int lugar, int value){
        this.elementos[lugar - 1] = value;
    }
    public int getDim() {
        return dim;
    }
    public void setDim(int dim) {
        this.dim = dim;
    }
    public Vector SistemaHomogeneo() {
        if (dim < 2) {
            System.out.println("Não foi possivel converter, tente novamente");
            return null;
        }
        float[] novoElementos = new float[dim + 1];
        for (int i = 0; i < dim; i++) {
            novoElementos[i] = elementos[i];
        }
        novoElementos[dim] = 1;
        return new Vector(dim + 1, novoElementos);
    }
    public Vector Vetor3D(float terceiraVariavel) {
        if (dim != 2) {
            System.out.println("O vetor deve ser 2D para converter");
            return null;
        }
        float[] novoElementos = new float[4];
        for (int i = 0; i < dim; i++) {
            novoElementos[i] = elementos[i];
        }
        novoElementos[2] = terceiraVariavel;
        novoElementos[3] = 1;
        return new Vector(4, novoElementos);
    }

}
