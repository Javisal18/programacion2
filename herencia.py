class Persona:
    def __init__(self, nombre: str, apellido: str, direccion: str, telefono: str, edad: int, email: str):
        self._nombre = nombre
        self._apellido = apellido
        self._direccion = direccion
        self._telefono = telefono
        self._edad = edad
        self._email = email
    
    # GET
    def get_nombre(self) -> str:
        return self._nombre

    def get_apellido(self) -> str:
        return self._apellido

    def get_direccion(self) -> str:
        return self._direccion

    def get_telefono(self) -> str:
        return self._telefono

    def get_edad(self) -> int:
        return self._edad

    def get_email(self) -> str:
        return self._email

    # SET
    def set_nombre(self, nombre: str):
        self._nombre = nombre

    def set_apellido(self, apellido: str):
        self._apellido = apellido

    def set_direccion(self, direccion: str):
        self._direccion = direccion

    def set_telefono(self, telefono: str):
        self._telefono = telefono

    def set_edad(self, edad: int):
        self._edad = edad

    def set_email(self, email: str):
        self._email = email


class Empleado(Persona):
    def __init__(self, nombre: str, apellido: str, direccion: str, telefono: str, edad: int, email: str,
                 salario: float, jefe_inmediato: str, anos_experiencia: int):
        super().__init__(nombre, apellido, direccion, telefono, edad, email)
        self._salario = salario
        self._jefe_inmediato = jefe_inmediato
        self._anos_experiencia = anos_experiencia
        self._cargo = self.calcular_cargo()
    
    # GETTERS
    def get_salario(self) -> float:
        return self._salario

    def get_jefe_inmediato(self) -> str:
        return self._jefe_inmediato

    def get_anos_experiencia(self) -> int:
        return self._anos_experiencia

    def get_cargo(self) -> str:
        return self._cargo

    # SETTERS
    def set_salario(self, salario: float):
        self._salario = salario
        self._cargo = self.calcular_cargo()  # Recalcular cargo al actualizar el salario

    def set_jefe_inmediato(self, jefe_inmediato: str):
        self._jefe_inmediato = jefe_inmediato

    def set_anos_experiencia(self, anos_experiencia: int):
        self._anos_experiencia = anos_experiencia
        self._cargo = self.calcular_cargo()  # Recalcular cargo al actualizar los años de experiencia

    def set_cargo(self, cargo: str):
        self._cargo = cargo

    def calcular_cargo(self) -> str:
        # Determinar el cargo del empleado
        if self._salario >= 5000000 and self._anos_experiencia >= 5 and 25 <= self._edad <= 45:
            return "Senior"
        elif 900000 <= self._salario <= 1200000 and 1 <= self._anos_experiencia <= 2 and 18 <= self._edad <= 22:
            return "Junior"
        else:
            return "No definido"

    def imprimir_detalle(self):
        # Imprimir detalle completo del empleado
        print(f"Nombre: {self.get_nombre()} {self.get_apellido()}")
        print(f"Dirección: {self.get_direccion()}")
        print(f"Teléfono: {self.get_telefono()}")
        print(f"Edad: {self.get_edad()}")
        print(f"Email: {self.get_email()}")
        print(f"Salario: ${self.get_salario():,.2f}")
        print(f"Jefe Inmediato: {self.get_jefe_inmediato()}")
        print(f"Años de Experiencia: {self.get_anos_experiencia()}")
        print(f"Cargo: {self.get_cargo()}")


def main():
    # Obtener datos del usuario
    nombre = input("Nombre: ")
    apellido = input("Apellido: ")
    direccion = input("Dirección: ")
    telefono = input("Teléfono: ")
    edad = int(input("Edad: "))
    email = input("Email: ")
    salario = float(input("Salario: "))
    jefe_inmediato = input("Jefe Inmediato: ")
    anos_experiencia = int(input("Años de Experiencia: "))
    
    # Crear objeto Empleado
    empleado = Empleado(nombre, apellido, direccion, telefono, edad, email, salario, jefe_inmediato, anos_experiencia)
    
    # Imprimir detalle del empleado
    empleado.imprimir_detalle()

if __name__ == "__main__":
    main()