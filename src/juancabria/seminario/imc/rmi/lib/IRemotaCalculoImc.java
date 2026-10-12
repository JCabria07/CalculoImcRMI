package juancabria.seminario.imc.rmi.lib;

/**
 * Interfaz para invocar los metodos de forma remota via LipeRMI
 * @author JuanCabria
 */
public interface IRemotaCalculoImc {
    public DatosImc calcularImc(DatosImc datos);
}
