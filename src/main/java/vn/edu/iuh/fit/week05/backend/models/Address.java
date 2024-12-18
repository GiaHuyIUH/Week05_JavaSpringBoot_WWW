package vn.edu.iuh.fit.week05.backend.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address", schema = "works")
public class Address {
    @Id
    @Column(name = "add_id", nullable = false)
    private Long id;

    @Column(name = "street", length = 150)
    private String street;

    @Column(name = "city", length = 50)
    private String city;

    @Column(name = "country")
    private CountryCode country;

    @Column(name = "number", length = 20)
    private String number;

    @Column(name = "zipcode", length = 7)
    private String zipcode;

     @OneToOne(mappedBy = "address")
    private Company company;

    @OneToOne(mappedBy = "address")
    private Candidate candidate;

    public Address(long s, String quangTrung, String hcm, String s1, CountryCode countryCode) {
        this.id = s;
        this.street = quangTrung;
        this.city = hcm;
        this.number = s1;
        this.country = countryCode;
    }
}