import java.util.Scanner;

public class taxi {
    //1. 택시 번호
    //2. 주유량
    //3. 현재속도
    //4. 목적지
    //5. 기본거리
    //6. 목적지까지 거리
    //7. 기본 요금
    //8. 거리당 요금
    //9. 상태 (운행 중, 일반)
    int num;
    int oil;
    int curSpeed;
    public String destination;
    int distance;
    int destination_distance;
    int fee;
    int price;
    int condition;
    int addfee;

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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDestination_distance() {
        return destination_distance;
    }

    public void setDestination_distance(int destination_distance) {
        this.destination_distance = destination_distance;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getAddfee() {
        return addfee;
    }

    public void setAddfee(int addfee) {
        this.addfee = addfee;
    }

    public taxi(int num, int oil, int curSpeed, String destination, int distance, int destination_distance, int fee, int condition, int addfee) {
        this.num = num; //번호
        this.oil = oil; //기름
        this.curSpeed = curSpeed; //현재속도
        this.destination = destination; //목적지
        this.distance = distance; //기본거리
        this.destination_distance = destination_distance; //목적지거리
        this.fee = fee; //요금

        this.condition = condition; //운행상태
        this.addfee = addfee;//추가요금
    }



    void playChangeTaxi(){
        //주유량이 떨어지거나 운행 종료시 차고지행.
        if(getOil()<0 || getCondition()==1){
            setCondition(1); //주유량이 떨어지면 차고지행으로간다.
        }
        else if(getOil()<10){
            System.out.println("주유가필요합니다.");
            setCondition(1);
        }
    }

    void addUser(){//승객탑승
        if(getCondition() == 1){
            System.out.println("탑승 불가");
        } else {
            setCondition(2);
            System.out.println("택시 탑승 완료");
        }
    }

    void speedChange(){ //속도변경
        Scanner sc = new Scanner(System.in);
        if(getOil()>=10){
            int speed = sc.nextInt();
            setCurSpeed(getCurSpeed()+speed);
            System.out.println("택시의 현재속도" + getCurSpeed() + "주유량" + getOil());
        }
        else{
            System.out.println("택시 주유량을 확인해주세요.");
        }
    }

    void pay(){
        int maxfee;
        if (getDestination_distance()>getDistance()){   //목적지거리가 기본거리를 넘었을때
            maxfee = (getDestination_distance()-getDistance())*getAddfee()+getFee();
            //(목적지거리-기본거리)*추가요금+기본요금
        }
        else {
            maxfee = fee;
        }
        System.out.println("최종요금은"+maxfee+"입니다");

    }

}