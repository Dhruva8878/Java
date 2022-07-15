package ass_2;

public enum Stadium {



    EDEN_GARDENS_STADIUM{
        @Override
        void message(){
            System.out.println("This is the home ground of KKR");
        }
    },
    WANKHEDE_STADIUM{
        @Override
        void message(){
            System.out.println("This is the home ground of Mumbai Indians");
        }
    },
    CHIDAMBARAM_STADIUM{
        @Override
        void message(){
            System.out.println("This is the home ground of CSK");
        }
    },
    M_CHINNASWAMY_STADIUM{
        @Override
        void message(){
            System.out.println("This is the home ground of RCB");
        }
    };

    void message(){
        System.out.println("Please Fill correct Stadium");
    }


}
