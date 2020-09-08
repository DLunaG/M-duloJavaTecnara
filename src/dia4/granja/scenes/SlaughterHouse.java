package dia4.granja.scenes;


import dia4.granja.animals.birdAnimals.Bird;

public class SlaughterHouse {

    public String sacrifaceBird(ChickenCoop chickenCoop){

        if(chickenCoop != null && !chickenCoop.birdsList.isEmpty()){
            Bird birdToSacrifice = chickenCoop.takeToSlaughter();
            birdToSacrifice.hasBeenSacrificed(true);
            return birdToSacrifice.getName() + " the " + birdToSacrifice.getAnimalType() + " has been slaughtered.";
        }
        return "There is no birds to slaught.";
    }


}
