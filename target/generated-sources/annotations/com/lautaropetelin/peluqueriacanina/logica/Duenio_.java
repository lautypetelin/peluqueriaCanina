package com.lautaropetelin.peluqueriacanina.logica;

import com.lautaropetelin.peluqueriacanina.logica.Mascota;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-10-31T18:43:52", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Duenio.class)
public class Duenio_ { 

    public static volatile SingularAttribute<Duenio, String> direccion;
    public static volatile SingularAttribute<Duenio, String> celular;
    public static volatile ListAttribute<Duenio, Mascota> mascotas;
    public static volatile SingularAttribute<Duenio, String> nombre;
    public static volatile SingularAttribute<Duenio, Integer> idDuenio;

}