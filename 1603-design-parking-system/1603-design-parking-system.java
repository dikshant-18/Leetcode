class ParkingSystem {
    int[] slots;
    public ParkingSystem(int big, int medium, int small) {
        slots = new int[]{big , medium , small};
    }
    
    public boolean addCar(int cartype) {
        if(slots[cartype - 1] > 0) {
            slots[cartype - 1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */