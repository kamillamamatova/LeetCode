class ParkingSystem {

    // Need to be global variables so they can be passed
    // into addCar
    int bigCapacity, mediumCapacity, smallCapacity;
    public ParkingSystem(int big, int medium, int small) {
        bigCapacity = big;
        mediumCapacity = medium;
        smallCapacity = small;
        
        /*
        - 3 kinds of parking spaces: small, medium, & big
            - fixed # of slows for each size
        */
    }
    
    public boolean addCar(int carType) {
        // If car type is big and there's space left
        if(carType == 1 && bigCapacity > 0){
            bigCapacity--;
            return true;
        }
        // If car type is medium and there's space left
        else if(carType == 2 && mediumCapacity > 0){
            mediumCapacity--;
            return true;
        }
        // If car type is small and there's space left
        else if(carType == 3 && smallCapacity > 0){
            smallCapacity--;
            return true;
        }
        // If there isn't space left
        else{
            return false;
        }

        /*
        - Will check whehter there's a parking space of
        carType for the car that was to get into the parking
        lot. 
        - big: 1, medium: 2, small: 3
        - A car can only park in a parking space of its
        carType
            - If there's no available space, return false
            - else, park the car in that size space * return
            true
        */
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
