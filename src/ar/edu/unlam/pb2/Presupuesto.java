package ar.edu.unlam.pb2;

public class Presupuesto {
private Double Sponsors;
private Double tickets;
private Double IngresoTV;
private Double IngresoMarketing;




//Constructor
public Presupuesto(Double sponsors, Double tickets, Double ingresoTV, Double ingresoMarketing) {
	
	Sponsors = sponsors;
	this.tickets = tickets;
	IngresoTV = ingresoTV;
	IngresoMarketing = ingresoMarketing;

}
//getters y setters
public Double getSponsors() {
	return Sponsors;
}
public void setSponsors(Double sponsors) {
	Sponsors = sponsors;
}
public Double getTickets() {
	return tickets;
}
public void setTickets(Double tickets) {
	this.tickets = tickets;
}
public Double getIngresoTV() {
	return IngresoTV;
}
public void setIngresoTV(Double ingresoTV) {
	IngresoTV = ingresoTV;
}
public Double getIngresoMarketing() {
	return IngresoMarketing;
}
public void setIngresoMarketing(Double ingresoMarketing) {
	IngresoMarketing = ingresoMarketing;
}
@Override
public String toString() {
	return "Presupuesto [Sponsors=" + Sponsors + ", tickets=" + tickets + ", IngresoTV=" + IngresoTV
			+ ", IngresoMarketing=" + IngresoMarketing + "]";
}




public Double SumaDePresupuesto() {
	
	return Sponsors+tickets+IngresoTV+IngresoMarketing;
	
}


	
}
