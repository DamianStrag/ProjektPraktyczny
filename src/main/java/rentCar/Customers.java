package rentCar;


    import javax.persistence.*;

    @Entity
    @Table(name = "Customer")

    public class Customers {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column
        private Integer id;
        @Column(name = "first_name")
        private String first_name;
        @Column(name = "last_name")
        private String last_name;


        private String getFirst_name() {
            return first_name;
        }

        private String getLast_name() {
            return last_name;
        }

        private void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        private void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        private Customers(String first_name, String last_name) {
            this.first_name = first_name;
            this.last_name = last_name;
        }

    }

