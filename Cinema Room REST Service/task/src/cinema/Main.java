package cinema;

import cinema.model.Seat;
import cinema.repository.CinemaRoomRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
@Slf4j
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
      SpringApplication.run(Main.class, args);
    }

}
