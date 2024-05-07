package exAniversario;

import java.time.LocalDate;

public class Util {

	public static double calculaIdade(LocalDate aniversario) {
		LocalDate agora = LocalDate.now();

		int difAnos = agora.getYear() - aniversario.getYear();

		int difMeses = agora.getMonthValue() - aniversario.getMonthValue();

		int difDias = agora.getDayOfMonth() - aniversario.getDayOfMonth();

		if (difMeses > 0) {
			return difAnos + difMeses / 12.0;
			// System.out.println(difAnos + " anos " + difMeses + " meses ");
		} else if (difMeses == 0) {
			if (difDias >= 0)
				return difAnos;
			else {
				difAnos--;
				return difAnos + 11 / 12.0;
			}
		} else {
			difAnos--;
			difMeses = difMeses + 12;
			return difAnos + difMeses / 12.0;
		}
	}

	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		System.out.println(agora);

		LocalDate aniversario = LocalDate.of(1977, 6, 17);
		System.out.println(aniversario);

		double idade = Util.calculaIdade(aniversario);
		System.out.println(idade);
	}
}
