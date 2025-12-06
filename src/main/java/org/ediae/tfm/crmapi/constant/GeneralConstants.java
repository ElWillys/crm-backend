package org.ediae.tfm.crmapi.constant;

public class GeneralConstants {
    private GeneralConstants() {}

    // Tipos de respuesta
    public static final String OK = "OK";
    public static final String ERROR = "ERROR";
    public static final String FORBIDDEN = "FORBIDDEN";
    public static final String EXCEPTION = "exception";
    public static final String TYPE = "type";
    public static final String DATA = "data";

    // Códigos genéricos
    public static final int GENERAL_ERROR_CODE = 1;
    public static final int BD_ERROR_CODE = 2;

    //Task - 100+
    //AppUser - 200+
    //Customer - 300+
    //Brand - 400+
    //Contact - 500+
    //Company - 600+
    //Role - 700+
    //Misc - 800+

    // Códigos y mensajes específicos para tareas
    public static final int TASK_NOT_FOUND_CODE = 100;
    public static final int TASK_CREATION_ERROR_CODE = 101;
    public static final int TASK_UPDATE_ERROR_CODE = 102;
    public static final int TASK_DELETE_ERROR_CODE = 103;
    public static final int TASK_STATUS_INVALID_CODE = 104;
    public static final int TASK_USER_INVALID_CODE = 105;

    public static final String TASK_NOT_FOUND_MESSAGE = "La tarea no ha sido encontrada";
    public static final String TASK_CREATION_ERROR_MESSAGE = "No se pudo crear la tarea";
    public static final String TASK_UPDATE_ERROR_MESSAGE = "No se pudo actualizar la tarea";
    public static final String TASK_DELETE_ERROR_MESSAGE = "No se pudo eliminar la tarea";
    public static final String TASK_STATUS_INVALID_MESSAGE = "El estado de la tarea no es válido";
    public static final String TASK_USER_INVALID_MESSAGE = "El usuario de la tarea no es válido";

    //AppUser códigos y mensajes de error
    public static final int APPUSER_NOT_FOUND_CODE = 200;
    public static final int APPUSER_CREATION_ERROR_CODE = 201;
    public static final int APPUSER_UPDATE_ERROR_CODE = 202;
    public static final int APPUSER_DELETE_ERROR_CODE = 203;
    public static final int APPUSER_LOGIN_ERROR_CODE = 204;
    public static final int APPUSER_EMAIL_NOT_FOUND_CODE = 205;
    public static final int APPUSER_NAME_SEARCH_ERROR_CODE = 206;
    public static final int APPUSER_EMAIL_IN_USE_ERROR_CODE = 207;
    public static final int APPUSER_COMPANY_REQUIRED_CODE = 208;
    public static final int APPUSER_NOT_AUTHENTICATED_CODE = 209;
    public static final int APPUSER_NOT_AUTHORIZED_CODE = 210;

    public static final String APPUSER_NOT_FOUND_MESSAGE = "El usuario no ha sido encontrado";
    public static final String APPUSER_CREATION_ERROR_MESSAGE = "No se pudo crear el usuario";
    public static final String APPUSER_UPDATE_ERROR_MESSAGE = "No se pudo actualizar el usuario";
    public static final String APPUSER_DELETE_ERROR_MESSAGE = "No se pudo eliminar el usuario, puede que haya tareas asociadas";
    public static final String APPUSER_LOGIN_ERROR_MESSAGE = "Email o contraseña inválidos";
    public static final String APPUSER_EMAIL_NOT_FOUND_MESSAGE = "No se encontró usuario con este email";
    public static final String APPUSER_NAME_SEARCH_ERROR_MESSAGE = "No se encontró usuario con este nombre";
    public static final String APPUSER_EMAIL_IN_USE_ERROR_MESSAGE = "Este correo electrónico ya existe";
    public static final String APPUSER_COMPANY_REQUIRED_MESSAGE = "Usuario tiene que estar asignado a una empresa";
    public static final String APPUSER_NOT_AUTHENTICATED_MESSAGE = "Tiene que estar logeado como admin para crear usuarios.";
    public static final String APPUSER_NOT_AUTHORIZED_MESSAGE = "Solamente los admins pueden crear usuarios";

    // Códigos y mensajes específicos para clientes
    public static final int CUSTOMER_NOT_FOUND_CODE = 300;
    public static final int CUSTOMER_CREATION_ERROR_CODE = 301;
    public static final int CUSTOMER_UPDATE_ERROR_CODE = 302;
    public static final int CUSTOMER_DELETE_ERROR_CODE = 303;

    public static final String CUSTOMER_CREATION_ERROR_MESSAGE = "No se pudo crear el cliente";
    public static final String CUSTOMER_UPDATE_ERROR_MESSAGE = "No se pudo actualizar el cliente";
    public static final String CUSTOMER_DELETE_ERROR_MESSAGE = "No se pudo eliminar el cliente, puede que haya tareas asociadas";
    public static final String CUSTOMER_NOT_FOUND_MESSAGE = "El cliente no ha sido encontrado";

    public static final int BRAND_NOT_FOUND_CODE = 400;
    public static final int BRAND_CREATION_ERROR_CODE = 401;
    public static final int BRAND_UPDATE_ERROR_CODE = 402;
    public static final int BRAND_DELETE_ERROR_CODE = 403;

    public static final String BRAND_CREATION_ERROR_MESSAGE = "No se pudo crear la marca";
    public static final String BRAND_UPDATE_ERROR_MESSAGE = "No se pudo actualizar la marcar";
    public static final String BRAND_DELETE_ERROR_MESSAGE = "No se pudo eliminar la marca, puede que haya tareas asociadas";
    public static final String BRAND_NOT_FOUND_MESSAGE = "La marca no se ha encontrado";

    public static final int CONTACT_CREATION_ERROR_CODE = 500;
    public static final int CONTACT_NOT_FOUND_CODE = 501;
    public static final int CONTACT_EDIT_ERROR_CODE = 502;
    public static final int CONTACT_DELETE_ERROR_CODE = 503;

    public static final String CONTACT_CREATION_ERROR_MESSAGE = "No se ha podido crear el contacto";
    public static final String CONTACT_NOT_FOUND_MESSAGE = "El contacto no ha sido encontrado";
    public static final String CONTACT_EDIT_ERROR_MESSAGE = "No se ha podido actualizar el contacto";
    public static final String CONTACT_DELETE_ERROR_MESSAGE = "No se ha podido eliminar el contacto, puede que haya entidades asociadas";

    public static final int COMPANY_CREATION_ERROR_CODE = 600;
    public static final int COMPANY_DELETION_ERROR_CODE = 601;
    public static final int COMPANY_NOT_FOUND_ERROR_CODE = 602;

    public static final String COMPANY_CREATION_ERROR_MESSAGE = "No se pudo crear la empresa";
    public static final String COMPANY_DELETION_ERROR_MESSAGE = "No se pudo borrar la empresa";
    public static final String COMPANY_NOT_FOUND_ERROR_MESSAGE = "La empresa no se ha encontrado";

    public static final int ROLE_NOT_FOUND_CODE = 700;
    public static final String ROLE_NOT_FOUND_MESSAGE = "No se ha encontrado el rol especificado";

    // Otros posibles
    public static final String GENERAL_ERROR_MESSAGE = "Error inesperado en el servidor";
    public static final String BD_ERROR_MESSAGE = "Error de conexión a base de datos";

    public static final int JSON_PROCESSING_ERROR_CODE = 800;
    public static final String JSON_PROCESSING_ERROR_MESSAGE = "Error al serializar los datos del usuario entrante";
}
