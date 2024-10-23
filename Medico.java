package atividade; 

public abstract class Medico extends ProfissionalSaude{
private String crm;
public Medico(String nome, String especialidade, int valorConsulta) {
super(nome, especialidade, valorConsulta);
this.crm = crm;
}
@Override
public void agendarConsulta() {
}

}