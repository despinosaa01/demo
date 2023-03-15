/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import com.github.javafaker.Faker;

/**
 *
 * @author ProfDiurno
 */
public class CuentaAhorro {

    public static void main(String[] args) {
        CuentaAhorro c;
        Faker faker = new Faker();

        String name = faker.name().firstName();
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton

        String streetAddress = faker.address().streetAddress();
    }
}
