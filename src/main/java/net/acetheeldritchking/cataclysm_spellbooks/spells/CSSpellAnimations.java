package net.acetheeldritchking.cataclysm_spellbooks.spells;

import io.redspace.ironsspellbooks.api.util.AnimationHolder;
import net.acetheeldritchking.cataclysm_spellbooks.CataclysmSpellbooks;
import net.minecraft.resources.ResourceLocation;

public class CSSpellAnimations {
    public static ResourceLocation ANIMATION_RESOURCE = ResourceLocation.fromNamespaceAndPath(CataclysmSpellbooks.MOD_ID, "animation");

    private static AnimationHolder playerAnim(String path, boolean playOnce) {
        return new AnimationHolder(ResourceLocation.fromNamespaceAndPath(CataclysmSpellbooks.MOD_ID, path), playOnce);
    }

    public static final AnimationHolder ANIMATION_MALEVOLENT_HAND_SIGN = playerAnim("malevolent_hand_sign", true);

    public static final AnimationHolder ANIMATION_CHARGE_GUN = playerAnim("charge_gun", true);

    public static final AnimationHolder ANIMATION_CHARGE_GUN_RELEASE = playerAnim("charged_gun_release", true);

    public static final AnimationHolder ANIMATION_CHARGE_GUN_FULL = playerAnim("full_gun_shoot", true);

    public static final AnimationHolder ANIMATION_SIMPLE_SHOOT = playerAnim("simple_shoot", true);

    public static final AnimationHolder ANIMATION_CHARGED_GROUND_SLAM = playerAnim("charged_ground_slam", true);

    public static final AnimationHolder ANIMATION_CONSTRUCT_SUMMON = playerAnim("construct_summon", true);

    public static final AnimationHolder ANIMATION_WRATH_ROAR = playerAnim("wrathful_roar", true);

    public static final AnimationHolder ANIMATION_DEFENSIVE_SWORD_STANCE_START = playerAnim("sword_stance_start", true);

    public static final AnimationHolder ANIMATION_DEFENSIVE_SWORD_STANCE_FINISH = playerAnim("sword_stance_finish", true);

    public static final AnimationHolder ANIMATION_POWERFUL_SWORD_SLASH = playerAnim("powerful_sword_slash", true);

    public static final AnimationHolder ANIMATION_RIGHT_HORIZONTAL_SLASH = playerAnim("right_horizontal_slash_one_handed", true);

    public static final AnimationHolder ANIMATION_LEFT_HORIZONTAL_SLASH = playerAnim("left_horizontal_slash_one_handed", true);
}
