## 🚍 Sistema de Transporte
---

## 📌 Visão Geral
Este projeto é um exercício de Programação Orientada a Objetos (POO) em Java que simula um sistema de transporte.
Ele demonstra conceitos como abstração, herança, encapsulamento e polimorfismo através das classes Vehicle, Car, Moto, Onibus, Motorista e Viagem.

---

## 🛠️ Funcionalidades
- Hierarquia de veículos:
- Classe abstrata Vehicle com atributos e métodos comuns.
- Subclasses Car, Moto e Onibus com lógica específica de cálculo de tarifa.
- Classe Motorista para representar o condutor da viagem.
- Classe Viagem para integrar veículo, motorista, passageiros e calcular o custo da viagem.
- Registro de passageiros com validação de capacidade.
- Polimorfismo: cada tipo de veículo calcula a tarifa de forma diferente.
- Main interativo: o usuário fornece dados via console.

---

## 📂 Estrutura do Projeto
com.kauabiscotto.TransportSystem/

│

├── Vehicle.java        # Classe base abstrata

├── Car.java            # Subclasse Carro

├── Moto.java           # Subclasse Moto

├── Onibus.java         # Subclasse Ônibus

├── Motorista.java      # Classe Motorista

├── Viagem.java         # Classe Viagem

└── Main.java           # Ponto de entrada com interação via teclado

---

## ▶️ Como Executar
- Clone ou baixe o projeto.
- Compile as classes:
```
javac com/kauabiscotto/TransportSystem/*.java
```
- Execute o programa:
```
java com.kauabiscotto.TransportSystem.Main
```

---

## 🖥️ Exemplo de Execução
 # Entrada:

Enter driver's name: João

Enter driver's license number: ABC12345

Enter years of experience: 5

Choose vehicle type (1-Car, 2-Motorcycle, 3-Bus): 3

Enter plate number: XYZ-9876

Enter passenger capacity: 40

Enter fuel consumption per km: 5

Enter origin: Curitiba

Enter destination: Piraquara

Enter distance in km: 20

Enter passenger names (type 'end' to finish):

Maria

Carlos

Ana

end

--

# Saída:

Passenger Maria registered

Passenger Carlos registered

Passenger Ana registered

--

=== Trip Details ===

Origin: Curitiba

Destination: Piraquara

Distance: 20.0 km

Driver: Driver [Name: João, License: ABC12345, Experience: 5 years]

Vehicle: Onibus [Plate: XYZ-9876, Capacity: 40, Fuel Consumption: 5]

Passengers: Maria, Carlos, Ana


Trip cost: $33.33

---

## 🎯 Conceitos Demonstrados
- Abstração: Vehicle é abstrata e não pode ser instanciada diretamente.
- Herança: Car, Moto e Onibus estendem Vehicle.
- Polimorfismo: calcularTarifa() se comporta de forma diferente dependendo do tipo de veículo.
- Encapsulamento: atributos privados com getters e setters.

---
