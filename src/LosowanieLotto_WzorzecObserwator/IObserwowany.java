package LosowanieLotto_WzorzecObserwator;


public interface IObserwowany {
    void dodajObserwator(IObserwator obserwator);

    void usunObserwator(IObserwator obserwator);

    void powiadomObserwujacych();
}
