def evaluar_edad_y_sexo(nombre, apellido, edad, sexo):
    if edad >= 18:
        print(f"{nombre} {apellido} es mayor de edad.")
    else:
        print(f"{nombre} {apellido} es menor de edad.")
    
    if sexo.lower() == "masculino":
        print(f"{nombre} {apellido} es un Hombre.")
    elif sexo.lower() == "femenino":
        print(f"{nombre} {apellido} es una Mujer.")
    else:
        print("Sexo no válido.")

# Recibe los parámetros de entrada
nombre = input("Ingrese su nombre: ")
apellido = input("Ingrese su apellido: ")
edad = int(input("Ingrese su edad: "))
sexo = input("Ingrese su sexo (Masculino/Femenino): ")

# Llama a la función con los parámetros de entrada
evaluar_edad_y_sexo(nombre, apellido, edad, sexo)
