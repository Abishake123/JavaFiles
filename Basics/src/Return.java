public class Return {
    public static void main(String[] args) {
        Return returntype=new Return();
        System.out.println(returntype.helloworld());
        System.out.println(returntype.sum());
        System.out.println(returntype.truth());
    }
    public String helloworld(){
        return "helloworld";
    }
    public Integer sum(){
        return 6;
    }
    public boolean truth(){
        return true;
    }
    
}
