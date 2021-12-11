package guru.springframework.msscssm.domain;

public enum PaymentEvent {

    PRE_AUTHORIZE,
    PRE_AUTH_APPROVE,
    PRE_AUTH_DECLINED,
    AUTHORIZED,
    AUTH_APPROVED,
    AUTH_DECLINED
}
