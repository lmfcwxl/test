package chain;

public class ChainPattern {

    //借款请求类
    static class BorrowRequest {
        //借款金额
        private int requestMoney;

        //有参构造器，初始化对象
        public BorrowRequest(int money) {
            System.out.println("有新请求，需要借款 " + money + "元");
            requestMoney = money;
        }

        //公共取值方法
        public int getMoney() {
            return requestMoney;
        }
    }

    //职员抽象类
    public abstract static class AbstractClerk {
        private AbstractClerk superior = null;
        protected String type;

        //公共赋值方法
        public void setSuperior(AbstractClerk superior) {
            this.superior = superior;
        }

        //借款处理
        public void approveRequest(BorrowRequest request) {
            //规定金额大于借款金额则处理请求
            if (getLimit() >= request.getMoney()) {
                System.out.println(getType() + "同意借款请求");
            } else {
                //如果上级不为空则将请求交给上级处理
                if (this.superior != null) {
                    this.superior.approveRequest(request);
                } else {
                    System.out.println("没有人能够同意借款请求");
                }
            }
        }

        //定义抽象方法，需要子类具体实现
        public abstract int getLimit();

        public String getType() {
            return type;
        }
    }

    //抽象类的具体实现类
    static class Clerk extends AbstractClerk {
        public Clerk() {
            super.type = "职员";
        }

        public int getLimit() {
            return 5000;
        }
    }

    static class Leader extends AbstractClerk {
        public Leader() {
            super.type = "组长";
        }

        public int getLimit() {
            return 20000;
        }
    }

    static class Manager extends AbstractClerk {
        public Manager() {
            super.type = "经理";
        }

        public int getLimit() {
            return 100000;
        }
    }


    public static void main(String[] args) {

        //抽象类不能直接实例化
        //多态的体现：父类的引用指向子类的实例对象
        AbstractClerk clerk = new Clerk();
        AbstractClerk leader = new Leader();
        AbstractClerk manager = new Manager();

        //设置上级
        clerk.setSuperior(leader);
        leader.setSuperior(manager);

        clerk.approveRequest(new BorrowRequest(10000));
        clerk.approveRequest(new BorrowRequest(111000));
    }
}
