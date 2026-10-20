class Sensor:
    tipo = "Genérico"
    def __init__(self, id: str, **kwargs):
        super().__init__(**kwargs)
        self.id = id
        self.encendido = False
    def activar(self):
        self.encendido = True
        print(f"Sensor {self.id} ({self.tipo}) activado.")
    def desactivar(self):
        self.encendido = False
        print(f"Sensor {self.id} ({self.tipo}) desactivado.")

class Camara(Sensor):
    tipo = "Cámara"
    def __init__(self, id: str, resolucion: str, **kwargs):
        super().__init__(id=id, **kwargs)
        self.resolucion = resolucion

class SensorLuzLaser(Sensor):
    tipo = "Luz Laser"
    def __init__(self, id: str, alcance: int, **kwargs):
        super().__init__(id=id, **kwargs)
        self.alcance = alcance

class VehiculoAutonomo(Camara, SensorLuzLaser):
    tipo = "Vehículo Autónomo"
    def __init__(self, id: str, resolucion: str, alcance: int):
        super().__init__(id=id, resolucion=resolucion, alcance=alcance)
# Test Vehículo Autónomo
if __name__ == "__main__":
    print("=== PRUEBA DEL SISTEMA DE VEHÍCULO AUTÓNOMO ===")
    auto = VehiculoAutonomo(id="VA-001", resolucion="4K", alcance=100)
    print(f"ID del vehículo: {auto.id}")
    print(f"Tipo (Atributo de clase): {auto.tipo}")
    print(f"Resolución de cámara: {auto.resolucion}")
    print(f"Alcance de láser: {auto.alcance} metros")
    print(f"Está encendido?: {auto.encendido}")
    
    auto.activar()
    print(f"Está encendido ahora?: {auto.encendido}")
    auto.desactivar()
    