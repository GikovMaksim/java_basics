public class Elevator {
    private int currentFloor = 1;
    private int minFloor = 0;
    private int maxFloor = 0;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown(){
        currentFloor -= 1;
    }

    public void moveUp(){
        currentFloor += 1;
    }

    public void move(int floor) {
        if (floor < this.minFloor | floor > this.maxFloor) {
            System.out.println("Ошибка. Нет такого этажа.");
            return;
        } else {
            while (currentFloor != floor) {
                if (currentFloor < floor) {
                    moveUp();
                    System.out.println("Текущий этаж: " + currentFloor);
                } else {
                    moveDown();
                    System.out.println("Текущий этаж: " + currentFloor);
                }
            }
        }
    }
}
