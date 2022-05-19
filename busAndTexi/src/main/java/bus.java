import java.util.Scanner;

public class bus {
    //필드
    int maxPassenger;   // 최대 승객 수
    int curPassenger;   // 현재 승객 수
    int fee;            // 가격
    int num;            // 버스 번호
    int oil;            // 주유량
    int curSpeed;       // 현재 속도
    boolean condition; //true이면 운행 false이면 차고행.

    public bus(int maxPassenger, int curPassenger, int fee, int num, int oil, int curSpeed) {
        this.maxPassenger = maxPassenger;
        this.curPassenger = curPassenger;
        this.fee = fee;
        this.num = num;
        this.oil = oil;
        this.curSpeed = curSpeed;
        this.condition = true;
    }


    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getCurPassenger() {
        return curPassenger;
    }

    public void setCurPassenger(int curPassenger) {
        this.curPassenger = curPassenger;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getCurSpeed() {
        return curSpeed;
    }

    public void setCurSpeed(int curSpeed) {
        this.curSpeed = curSpeed;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    // 메소드 게터 세터 만들고  현재의 주유량을 알아올떄 쓰는게 겟오일 this.oil 과 getOil은 같은뜻
    void playChange(){
        //주유량이 떨어지거나 운행 종료시 차고지행.
        if(getOil()<0 || !isCondition()){
            setCondition(false); //주유량이 떨어지면 차고지행으로간다.
        }
        else if(getOil()<10){
            System.out.println("버스 주유가필요합니다.");
        }
    }

    void speedChange(){ //속도변경
        Scanner sc = new Scanner(System.in);
        if(getOil()>=10){
            int speed = sc.nextInt();
            setCurSpeed(getCurSpeed()+speed);
            System.out.println("버스의 현재속도"+getCurSpeed() + "주유량" + getOil());
        }
        else{
            System.out.println("버스 주유량을 확인해주세요.");
        }
    }

    void addUser(){//승객탑승
        if(getCurPassenger()+1<=getMaxPassenger() && isCondition()){
            setCurPassenger(getCurPassenger()+1);
        }
    }

}