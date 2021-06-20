package Gomes.Branquinho.Daniel;


public class Test_tree{



    public static void main(String[] args) {
        //Criação de objetos
        BinaryTree x = new BinaryTree();
        x.insert_root(5);
        //BinaryTreeNode nbase = new BinaryTreeNode(5);
        BinaryTreeNode n0   = new BinaryTreeNode(5);
        BinaryTreeNode no_1 = new BinaryTreeNode(4) ;
        BinaryTreeNode no_2 = new BinaryTreeNode(3) ;
        BinaryTreeNode no_3 = new BinaryTreeNode(7) ;
        BinaryTreeNode no_1_1 = new BinaryTreeNode(1) ;
        BinaryTreeNode no_1_2 = new BinaryTreeNode(2) ;
        BinaryTreeNode no_2_1 = new BinaryTreeNode(8) ;
        BinaryTreeNode no_2_2 = new BinaryTreeNode(21) ;
        BinaryTreeNode no_2_3 = new BinaryTreeNode(12) ;
        BinaryTreeNode no_3_1 = new BinaryTreeNode(0) ;
        BinaryTreeNode no_3_2 = new BinaryTreeNode(6) ;


          //Atribuições
            x.root.primogenito = no_1;
            x.root.meio = no_2;
            x.root.cacula = no_3;
            n0.parent = null;
            n0.primogenito = no_1;
            n0.meio = no_2;
            n0.cacula = no_3;
            no_1.parent = n0;
            no_1.primogenito = no_1_1;
            no_1.cacula = no_1_2;
            no_1_1.parent = no_1;
            no_1_2.parent = no_1;
            no_2_1.parent = no_2;
            no_2_2.parent = no_2_1;
            no_2_3.parent = no_2_1;
            no_3_1.parent = no_3;
            no_3_2.parent = no_3;
            no_2.parent = n0;
            no_2.primogenito = no_2_1;
            no_2_1.primogenito = no_2_2;
            no_2_1.cacula = no_2_3;
            no_3.parent = n0;
            no_3.primogenito = no_3_1;
            no_3.cacula = no_3_2;



        System.out.println(" ");
        System.out.println("Atividade 10 - Immplementação de Árvores");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------");
        //Questão 1:
        System.out.println("Questão 1: ");
        System.out.println(" ");
        //a) Função ImprimeFilhos() usando o no_2 como exemplo
        System.out.print("a) Função ImprimeFilhos(), sendo o primeiro dígito o pai da sub-árvoce: ");
        System.out.println("");
        no_2.ImprimeFilhos();
        System.out.println("----------------------------------------------------------------");


        //b) Função Pai() que retorna a referência do nó. Utilizando ,como exemplo, o n0 = 5 (Pai de todos)
        System.out.println("b) Referência do nó correspondente ao pai: ");
        x.root.Pai(no_2);
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------");

        //c) Função ImprimePai() utilizando, como exemplo, o no_2 = 3
        System.out.println("c) Elemento inteiro armazenado no nó do pai: ");
        x.root.ImprimePai(no_2);
        System.out.println("----------------------------------------------------------------");

        //d) Função EhInterno() utilizando , como exemplo, o no_3_2 = 6 (nó externo)
        System.out.println("Retorna TRUE para nó interno e FALSE para nó externo.");
        System.out.println("Número 6 é interno? ");
        System.out.println(x.root.EhInterno(no_2_2));
        //Teste da mesma função utilizando um nó inteno
        System.out.println("Número 7 é interno? ");
        System.out.println(x.root.EhInterno(no_3));
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------");

        //e)
        System.out.println("e) Imprime Filhos que também são folhas: ");
        x.root.ImprimeFilhosFolhas(no_3);
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------");


        //f) Função PreOrder()
        System.out.println("f) PreOrder(): ");
        x.root.binaryPreorder();
        System.out.println("----------------------------------------------------------------");

        //g) Função PostOrder()
        System.out.println("g) PostOrder(): ");
        x.root.binaryPosorder();
        System.out.println("----------------------------------------------------------------");

//----------------------------------------------------------------------------------------------------------------------
        System.out.println("----------------------------------------------------------------");
        //Questão 2:
        System.out.println("Questão 2: ");
        System.out.println(" ");
        //a)
        System.out.print("a) Função ImprimeFilhos() aplicando o número 5: ");
        System.out.println("");
        n0.ImprimeFilhos2();
        System.out.println("----------------------------------------------------------------");

        //b)
        System.out.println("b) Valor armazenado do pai do nó 8:");
        x.root.ValorPapai(no_2_1);
        System.out.println("----------------------------------------------------------------");

        //c)
        System.out.println("c) Multiplica por dois todos os nós de um determinado filho.");
        System.out.println("Executando para o nó 8:");
        no_2_1.DobraFilhos();
        System.out.println("----------------------------------------------------------------");

        //d)
        System.out.println("d) Mutiplica o valor do pai de um determinado nó");
        System.out.println("Executando para o nó 2:");
        x.root.DobraPai(no_1_2);
        System.out.println("----------------------------------------------------------------");
    }









}
