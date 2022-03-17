class Car:
    
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")

car1 = Car("Skoda", "Slavia", "2022", "Manual", "Red")
car2 = Car("Maruti Suzuki", "Ciaz", "2021", "Automatic", "White")
car3 = Car("Hyundai", "Amaze", "2020", "Manual", "Grey")

car1.accelerate()
car1.stop()