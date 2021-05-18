import java.util.Scanner;

public class Button {

    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }

    public interface OnClickListener{
        public void onClick(String title);
    }

//    public static void listen(){
//        boolean quit = false;
//        while(!quit){
//            int choice = sc.nextInt();
//            sc.nextLine();
//            switch(choice){
//                case 0:
//                    quit = true;
//                    break;
//                case 1:
//                    btnPrint.onClick();
//            }
//        }
//    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Button btnPrint = new Button("Print");



        //EXAMPLE OF LOCAL CLASS
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            public void onClick(String title){
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        //ANONYMOUS INNER CLASS
        btnPrint.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

//        listen();
    }


}
