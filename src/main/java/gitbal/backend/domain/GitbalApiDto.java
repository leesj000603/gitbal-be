package gitbal.backend.domain;

public record GitbalApiDto(Long score, Boolean recentCommit) {

    public static GitbalApiDto of(Long score, Boolean recentCommit) {
        return new GitbalApiDto(score, recentCommit);
    }
}