package cdi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.inject.Scope;

@Data
@AllArgsConstructor // Parametreli constructor
@NoArgsConstructor // Parametresiz constructor
@Builder

// CDI bean yapisi
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named { // data bileseni olustururz ve onlari bir yerde kullanmak istiyorsak @Named yapisini kullanicaz

    private Long namedId;
    private String namedData = "Merhabalar Named Cdi Bean";

}
