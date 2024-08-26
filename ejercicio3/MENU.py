personas = []

while True:
    print("1. Crear persona")
    print("2. Eliminar persona")
    print("3. Listar personas")
    print("4. Buscar persona")
    print("5. Salir")

    opcion = input("Ingrese una opción: ")

    if opcion == "1":
        nombre = input("Ingrese nombre de la persona: ")
        personas.append(nombre)
        print("Persona creada con éxito")
        print("Lista de personas:", personas)

    elif opcion == "2":
        if len(personas) == 0:
            print("No hay personas en la lista")
        else:
            print("Lista de personas:")
            for i, persona in enumerate(personas):
                print(f"{i+1}. {persona}")
            indice = int(input("Ingrese el índice de la persona a eliminar: ")) - 1
            if 0 <= indice < len(personas):
                personas.pop(indice)
                print("Persona eliminada con éxito")
            else:
                print("Índice no válido")

    elif opcion == "3":
        if len(personas) == 0:
            print("No hay personas en la lista")
        else:
            print("Lista de personas:", personas)

    elif opcion == "4":
        if len(personas) == 0:
            print("No hay personas en la lista")
        else:
            nombre = input("Ingrese nombre de la persona a buscar: ")
            if nombre in personas:
                print("Persona encontrada")
            else:
                print("Persona no encontrada")

    elif opcion == "5":
        break

    else:
        print("Opción no válida")