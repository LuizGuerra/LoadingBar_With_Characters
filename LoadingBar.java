public class LoadingBar{
    public void porcentagem(int totalDeAcoes, int acaoAtual){
        double x=(100*acaoAtual/totalDeAcoes);
        int y=((int)x/10);
        double z=(100*acaoAtual/totalDeAcoes);
        System.out.print("\f");
        switch(y){
            case 0:  System.out.println("[①②③④⑤⑥⑦⑧⑨⑩]"); break;
            case 1:  System.out.println("[❶②③④⑤⑥⑦⑧⑨⑩]"); break;
            case 2:  System.out.println("[❶❷③④⑤⑥⑦⑧⑨⑩]"); break;
            case 3:  System.out.println("[❶❷❸④⑤⑥⑦⑧⑨⑩]"); break;
            case 4:  System.out.println("[❶❷❸❹⑤⑥⑦⑧⑨⑩]"); break;
            case 5:  System.out.println("[❶❷❸❹❺⑥⑦⑧⑨⑩]"); break;
            case 6:  System.out.println("[❶❷❸❹❺❻⑦⑧⑨⑩]"); break;
            case 7:  System.out.println("[❶❷❸❹❺❻❼⑧⑨⑩]"); break;
            case 8:  System.out.println("[❶❷❸❹❺❻❼❽⑨⑩]"); break;
            case 9:  System.out.println("[❶❷❸❹❺❻❼❽❾⑩]"); break;
            case 10: break; //System.out.println("[❶❷❸❹❺❻❼❽❾❿]"); break;
            default: System.out.println("ERROR"); break;
        }
        if(y>=0 || y<10){
            System.out.println("\t"+z+"%");
            System.out.println("\n\nNúmero atual: " + acaoAtual);
        }
    }
    int totalDeAcoes, acaoAtual=0;
    public LoadingBar(int totalDeAcoes){
        this.totalDeAcoes=totalDeAcoes;
    }
    public void pull(){
        acaoAtual++;
        porcentagem();
    }
    private void porcentagem(){
        double x=(100*acaoAtual/totalDeAcoes);
        int y=((int)x/10);
        double z=(100*acaoAtual/totalDeAcoes);
        System.out.print("\f");
        switch(y){
            case 0:  System.out.println("[①②③④⑤⑥⑦⑧⑨⑩]"); break;
            case 1:  System.out.println("[❶②③④⑤⑥⑦⑧⑨⑩]"); break;
            case 2:  System.out.println("[❶❷③④⑤⑥⑦⑧⑨⑩]"); break;
            case 3:  System.out.println("[❶❷❸④⑤⑥⑦⑧⑨⑩]"); break;
            case 4:  System.out.println("[❶❷❸❹⑤⑥⑦⑧⑨⑩]"); break;
            case 5:  System.out.println("[❶❷❸❹❺⑥⑦⑧⑨⑩]"); break;
            case 6:  System.out.println("[❶❷❸❹❺❻⑦⑧⑨⑩]"); break;
            case 7:  System.out.println("[❶❷❸❹❺❻❼⑧⑨⑩]"); break;
            case 8:  System.out.println("[❶❷❸❹❺❻❼❽⑨⑩]"); break;
            case 9:  System.out.println("[❶❷❸❹❺❻❼❽❾⑩]"); break;
            case 10: break; //System.out.println("[❶❷❸❹❺❻❼❽❾❿]"); break;
            default: System.out.println("ERROR"); break;
        }
        if(y>=0 || y<10){
            System.out.println("\t"+z+"%");
            System.out.println("\n\nNúmero atual: " + acaoAtual);
        }
    }
}