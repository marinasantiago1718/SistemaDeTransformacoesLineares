import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);


        System.out.println("Vetor");
        int dim = 2;
        float[] elementos = new float[dim];
        for (int k = 0; k < dim; k++) {
            System.out.printf("Digite o número %d: ", (k+1));
            elementos[k] = prompt.nextInt();
        }
        Vector vetor2D = new Vector(dim, elementos);
        System.out.println("\nVetor:");
        vetor2D.imprimirVetor();
        System.out.println("    ");
        Vector vetorHomogeneo2d = vetor2D.SistemaHomogeneo();
        System.out.println("\nVetor homogêneo: ");
        vetorHomogeneo2d.imprimirVetor();
        System.out.println("    ");
        dim = 3;

        System.out.println("\nDigite o novo termo para o vetor 3D");
        Vector vetor3D = vetor2D.Vetor3D(prompt.nextInt());

        System.out.println("Vetor 3D homogêneo: ");
        vetor3D.imprimirVetor();
        System.out.println("\n    ");

        //TRANSLAÇÃO

        System.out.println("\nDigite dx e dy para Translação em 2D: ");
        float dx2D = prompt.nextFloat();
        float dy2D = prompt.nextFloat();
        Vector vetorTransladado2D = Transformations.translate2D(vetorHomogeneo2d, dx2D, dy2D);
        System.out.println("\nVetor2D após Translação: ");
        vetorTransladado2D.imprimirVetor();

        System.out.println("\nDigite dx, dy e dz para Translação em 3D: ");
        float dx3D = prompt.nextFloat();
        float dy3D = prompt.nextFloat();
        float dz3D = prompt.nextFloat();
        Vector vetorTransladado3D = Transformations.translate3D(vetor3D, dx3D, dy3D, dz3D);
        System.out.println("\nVetor3D após Translação: ");
        vetorTransladado3D.imprimirVetor();
        System.out.println("\n ");

        // Rotação 2D
        System.out.print("\nDigite o ângulo de rotação para o vetor 2D em graus: ");
        float angulo2D = prompt.nextFloat();
        Vector rotacao2D = Transformations.rotacao2D(vetorHomogeneo2d, angulo2D);
        System.out.println("\nVetor 2D rotacionado:");
        rotacao2D.imprimirVetorEmLinhas();
        System.out.println();

        // Rotação 3D
        System.out.print("\nDigite o ângulo de rotação para o vetor 3D em graus: ");
        float angulo3D = prompt.nextFloat();

        Vector rotacao3Dx = Transformations.rotacao3DX(vetor3D, angulo3D);
        System.out.println("\nVetor 3D rotacionado em relação ao eixo x:");
        rotacao3Dx.imprimirVetorEmLinhas();
        System.out.println();

        Vector rotacao3Dy = Transformations.rotacao3DY(vetor3D, angulo3D);
        System.out.println("\nVetor 3D rotacionado em relação ao eixo y:");
        rotacao3Dy.imprimirVetorEmLinhas();
        System.out.println();

        Vector rotacao3Dz = Transformations.rotacao3DZ(vetor3D, angulo3D);
        System.out.println("\nVetor 3D rotacionado em relação ao eixo z:");
        rotacao3Dz.imprimirVetorEmLinhas();
        System.out.println();

        //REFLEXÃO
        Vector Reflexaox = Transformations.reflexao2Dx(vetorHomogeneo2d);
        System.out.println("\n Vetor2D refletido em relação ao eixo x: ");
        Reflexaox.imprimirVetor();

        Vector Reflexaoy = Transformations.reflexao2Dy(vetorHomogeneo2d);
        System.out.println("\nVetor2D refletido em relação ao eixo x: ");
        Reflexaoy.imprimirVetor();

        Vector Reflexao3dx = Transformations.reflexao3Dx(vetor3D);
        System.out.println("\nVetor 3D refletido em relação ao eixo x:");
        Reflexao3dx.imprimirVetor();

        Vector Reflexao3dy = Transformations.reflexao3Dy(vetor3D);
        System.out.println("\nVetor 3D refletido em relação ao eixo y:");
        Reflexao3dy.imprimirVetor();

        Vector Reflexao3dz = Transformations.reflexao3Dz(vetor3D);
        System.out.println("\nVetor 3D refletido em relação ao eixo z:");
        Reflexao3dz.imprimirVetor();
        System.out.println("\n ");


        //PROJEÇÃO

        Vector Projecao2dX = Transformations.projecao2DX(vetorHomogeneo2d);
        System.out.println("\nVetor2D Projetado em relação ao eixo X: ");
        Projecao2dX.imprimirVetor();

        Vector Projecao2dY = Transformations.projecao2DY(vetorHomogeneo2d);
        System.out.println("\nVetor2D Projetado em relação ao eixo Y");
        Projecao2dY.imprimirVetor();

        Vector Projecao3dX = Transformations.projecao3DX(vetor3D);
        System.out.println("\nVetor 3D Projetado em relação ao eixo X: ");
        Projecao3dX.imprimirVetor();

        Vector Projecao3dY = Transformations.projecao3DY(vetor3D);
        System.out.println("\nVetor 3D Projetado em relação ao eixo Y:");
        Projecao3dY.imprimirVetor();

        Vector Projecao3dz = Transformations.projecao3DZ(vetor3D);
        System.out.println("\nVetor 3D Projetado em relação ao eixo Z");
        Projecao3dz.imprimirVetor();
        System.out.println("\n ");


        //CISALHAMENTO

        System.out.println("\nDigite kx e ky para Cisalhamento em 2D: ");
        float kx = prompt.nextFloat();
        float ky = prompt.nextFloat();
        Vector vetorCisalhado2D = Transformations.shearing(vetorHomogeneo2d, kx, ky);
        System.out.println("\nVetor 2D após o cisalhamento:");
        vetorCisalhado2D.imprimirVetor();



        prompt.close();

    }
}