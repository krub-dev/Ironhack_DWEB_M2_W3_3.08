package com.krub.nurses_association.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conference extends Event {
    @OneToMany
    private List<Speaker> speakers;
}
