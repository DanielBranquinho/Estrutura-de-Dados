package Gomes.Branquinho.Daniel;

public class BinaryTreeNode {
        int item;
        BinaryTreeNode parent;
        BinaryTreeNode primogenito;
        BinaryTreeNode meio;
        BinaryTreeNode cacula;


        public BinaryTreeNode(int item) {
            this.item = item;
            this.parent = null;
            this.primogenito = null;
            this.meio = null;
            this.cacula = null;

        }

        public BinaryTreeNode parent() {
            if (this.parent == null)
                return null;
            else return this.parent;
        }

        public boolean getParent() {
            if (this.parent == null)
                return false;
            else return true;
        }

        public BinaryTreeNode primogenito() {
            if (this.primogenito == null)
                return null;
            else return this.primogenito;
        }

        public boolean getPrimogenito() {
            if (this.primogenito == null)
                return false;
            else return true;
        }

        public BinaryTreeNode cacula() {
            if (this.cacula == null)
                return null;
            else return this.cacula;
        }

        public boolean getCacula() {
            if (this.cacula == null)
                return false;
            else return true;
        }

        public BinaryTreeNode meio() {
            if (this.meio == null)
                return null;
            else return this.meio;
        }

        public boolean getMeio() {
            if (this.meio == null)
                return false;
            else return true;
        }



        public boolean EhInterno(BinaryTreeNode node){

            if(node.getMeio() || node.getPrimogenito() || node.getCacula() == true){
                    return true;

            }else{
                return false;
            }
            }





        public void ImprimeFilhosFolhas(BinaryTreeNode node) {


            if (node.meio != null || node.cacula != null){


                if (node.getPrimogenito() == true) {
                    System.out.println(node.primogenito.item);
                }
                if (node.getMeio() == true) {
                    System.out.println(node.meio.item);
                }
                if (node.getCacula() == true) {
                    System.out.println(node.cacula.item);
                }

            } else System.out.println("?? um n?? interno sem folhas ou uma folha");
        }


                // Fun????o Pai()
                public void Pai(BinaryTreeNode node){
                    System.out.println(node.parent);
                }




                // Fun????o ImprimeFilhos()
                public void ImprimeFilhos() {
                    if (this.getMeio())
                        this.meio.ImprimeFilhos();
                    System.out.println(this.item);
                    if (this.getPrimogenito())
                        this.primogenito.ImprimeFilhos();
                    if (this.getCacula())
                        this.cacula.ImprimeFilhos();



                }

                // Fun????o ImprimeFilhos2()
                 public void ImprimeFilhos2() {
                     if (this.getPrimogenito())
                         System.out.println(primogenito.item);
                     if (this.getMeio())
                         System.out.println(meio.item);
                     if (this.getCacula())
                         System.out.println(cacula.item);


                 }


                // Fun????o ImprimePai()
                public void ImprimePai(BinaryTreeNode node) {
                    System.out.println(node.parent.item);

        }


                    // Fun????o Postorder()
                    public void binaryPosorder() {
                        System.out.println(this.item);
                        if (this.getPrimogenito())
                            this.primogenito.binaryPosorder();
                        if (this.getMeio())
                            this.meio.binaryPosorder();
                        if (this.getCacula())
                            this.cacula.binaryPosorder();

                    }

                 // Fun????o Preorder()
                public void binaryPreorder() {

                if (this.getPrimogenito())
                    this.primogenito.binaryPreorder();
                if (this.getMeio())
                    this.meio.binaryPreorder();
                if (this.getCacula())
                    this.cacula.binaryPreorder();
                    System.out.println(this.item);
             }


                //Valor Pai do n?? 8
                public void ValorPapai(BinaryTreeNode node){
                    System.out.println(node.parent.item);


        }

                public void DobraFilhos() {
                    if (this.getPrimogenito()==true)
                        System.out.println(this.primogenito.item*2);
                    if (this.getMeio()==true)
                        System.out.println(this.meio.item*2);
                    if (this.getCacula()==true)
                        System.out.println(this.cacula.item*2);
                }


                public void DobraPai(BinaryTreeNode node){
                    System.out.println(node.parent.item*2);
                }










}



















