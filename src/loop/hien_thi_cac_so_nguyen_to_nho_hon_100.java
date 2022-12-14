package loop;

public class hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        int  num=2;
        while(num<100){
            boolean check=true;
            if(num<2){
                check=false;
            }else{
                for (int i=2;i<num;i++){
                    if(num%i==0){
                        check=false;
                    }
                }
            }
            if(check==true){
                System.out.println(num+" ");

            }
            num++;
        }
    }
}
